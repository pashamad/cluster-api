package network.clusterone.api.repository

import network.clusterone.api.domain.User
import org.springframework.data.r2dbc.convert.R2dbcConverter
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.data.relational.core.sql.Column
import org.springframework.data.relational.core.sql.Expression
import org.springframework.data.relational.core.sql.Table
import org.springframework.r2dbc.core.DatabaseClient
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

/**
 * Spring Data R2DBC repository for the {@link User} entity.
 */
@Repository
interface UserRepository : R2dbcRepository<User, String>, UserRepositoryInternal {

    @Query("SELECT * FROM users WHERE email = :email")
    fun findOneByEmail(email: String?): Mono<User?>
}

interface UserRepositoryInternal {

    fun findOneWithAuthoritiesByLogin(login: String): Mono<User>

    fun create(user: User): Mono<User>
}

class UserRepositoryInternalImpl(val db: DatabaseClient, val r2dbcEntityTemplate: R2dbcEntityTemplate, val r2dbcConverter: R2dbcConverter) : UserRepositoryInternal {

    override fun findOneWithAuthoritiesByLogin(login: String): Mono<User> {
        TODO("Not yet implemented")
    }

    override fun create(user: User): Mono<User> {
        return r2dbcEntityTemplate.insert(User::class.java).using(user)
            .defaultIfEmpty(user)
    }
}

class UserSqlHelper {
    fun getColumns(table: Table, columnPrefix: String): MutableList<Expression> {
        val columns = mutableListOf<Expression>()
        columns.add(Column.aliased("id", table, columnPrefix + "_id"))
        columns.add(Column.aliased("login", table, columnPrefix + "_login"))
        columns.add(Column.aliased("first_name", table, columnPrefix + "_first_name"))
        columns.add(Column.aliased("last_name", table, columnPrefix + "_last_name"))
        columns.add(Column.aliased("email", table, columnPrefix + "_email"))
        columns.add(Column.aliased("activated", table, columnPrefix + "_activated"))
        columns.add(Column.aliased("lang_key", table, columnPrefix + "_lang_key"))
        columns.add(Column.aliased("image_url", table, columnPrefix + "_image_url"))
        return columns
    }
}
