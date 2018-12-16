# uuidTest

CREATE KEYSPACE IF NOT EXISTS reservation WITH replication = {'class':'SimpleStrategy', 'replication_factor':1};

CREATE TABLE IF NOT EXISTS  reservation.reserve (
    uuid uuid,
    orderId varchar,
    primary key((uuid))
);
