/*Inserting top categories*/
INSERT INTO categories (category,category_id) VALUES ("Mobiles & Tablets","M&T");
INSERT INTO categories (category,category_id) VALUES ("Computers","Comp");
INSERT INTO categories (category,category_id) VALUES ("Home Appliances","HA");

/*Inserting values of categories of Mobiles and tablets*/
INSERT INTO categories (category,category_id,parent_id) VALUES ("Mobiles","Mob","M&T");
INSERT INTO categories (category,category_id,parent_id) VALUES ("Tablets","Tab","M&T");
INSERT INTO categories (category,category_id,parent_id) VALUES ("Accessories","Acc","M&T");
INSERT INTO categories (category,category_id,parent_id) VALUES ("Cases & Covers","C&C","M&T");

/*Inserting values of categories of Mobiles*/
INSERT INTO categories (category,category_id,parent_id) VALUES ("Smart Phones","SP","Mob");
INSERT INTO categories (category,category_id,parent_id) VALUES ("Featured Phones","FP","Mob");

/*Inserting values of categories of Tablets*/
INSERT INTO categories (category,category_id,parent_id) VALUES ("2G","2G1","Tab");
INSERT INTO categories (category,category_id,parent_id) VALUES ("3G","3G1","Tab");

/*Inserting values of categories of Computers*/
INSERT INTO categories (category,category_id,parent_id) VALUES ("Desktop","Desk","Comp");
INSERT INTO categories (category,category_id,parent_id) VALUES ("Laptop","Lap","Comp");
INSERT INTO categories (category,category_id,parent_id) VALUES ("Laptop Accessories","L&A","Comp");
INSERT INTO categories (category,category_id,parent_id) VALUES ("Printers","Print","Comp");

/*Inserting values of categories of Laptop Accessories*/
INSERT INTO categories (category,category_id,parent_id) VALUES ("Keyboard","KeyB","L&A");
INSERT INTO categories (category,category_id,parent_id) VALUES ("Mouse","M","L&A");
INSERT INTO categories (category,category_id,parent_id) VALUES ("Headphones","HP","L&A");

/*Inserting values of categories of Printers*/
INSERT INTO categories (category,category_id,parent_id) VALUES ("Inkjet","InJ","Print");
INSERT INTO categories (category,category_id,parent_id) VALUES ("Laser","L","Print");

/*Inserting values of categories of Home Appliances*/
INSERT INTO categories (category,category_id,parent_id) VALUES ("TVs","TV","HA");
INSERT INTO categories (category,category_id,parent_id) VALUES ("Air Conditioners","A&C","HA");
INSERT INTO categories (category,category_id,parent_id) VALUES ("Washing Machines","W&M","HA");

/*Inserting values of categories of TV*/
INSERT INTO categories (category,category_id,parent_id) VALUES ("LED","Led","TV");
INSERT INTO categories (category,category_id,parent_id) VALUES ("LCD","Lcd","TV");
INSERT INTO categories (category,category_id,parent_id) VALUES ("Plasma","Plasma","TV");

/*Inserting values of categories of Washing Machines*/
INSERT INTO categories (category,category_id,parent_id) VALUES ("Full Automatic","F&A","W&M");
INSERT INTO categories (category,category_id,parent_id) VALUES ("Semi Automatic","S&A","W&M");

/*Inserting values of categories of Full Automatic*/
INSERT INTO categories (category,category_id,parent_id) VALUES ("Top Load","T&L","F&A");
INSERT INTO categories (category,category_id,parent_id) VALUES ("Front Load","F&L","F&A");











