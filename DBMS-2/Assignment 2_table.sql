
CREATE DATABASE ECommerce;
USE ECommerce;


/*Creating table for the ECommerece categories*/
CREATE TABLE categories(
   category varchar(45),
   category_id varchar(45),
   parent_id varchar(45),
   PRIMARY KEY(category_id),
   FOREIGN KEY(parent_id) references categories(category_id)
);

