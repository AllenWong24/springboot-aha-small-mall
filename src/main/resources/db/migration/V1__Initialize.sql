-- 用户
CREATE TABLE IF NOT EXISTS users (
  user_id varchar(32) NOT NULL,
  create_time datetime DEFAULT NULL,
  update_time datetime DEFAULT NULL,
  is_deleted bool DEFAULT FALSE COMMENT '是否删除',
  user_email varchar(255) DEFAULT NULL,
  user_password varchar(255) DEFAULT NULL,
  user_nickname varchar(255) DEFAULT NULL,
  user_address varchar(255) DEFAULT NULL,
  user_sex varchar(255) DEFAULT NULL,
  user_birthday datetime DEFAULT NULL,
  user_name varchar(255) DEFAULT NULL,
  is_active bit(1) DEFAULT NULL COMMENT '激活状态',
  user_phone varchar(255) DEFAULT NULL,
  user_avatar varchar(255) DEFAULT NULL COMMENT '头像',
  user_unionid varchar(255) DEFAULT NULL,
  user_balance float NOT NULL DEFAULT '0' COMMENT '余额',
  user_openid varchar(255) DEFAULT NULL,
  PRIMARY KEY (user_id)
);

-- 商品分类
CREATE TABLE IF NOT EXISTS categories (
  cat_id varchar(32) NOT NULL,
  create_time datetime DEFAULT NULL,
  update_time datetime DEFAULT NULL,
  is_deleted bool DEFAULT FALSE COMMENT '是否删除',
  cat_name varchar(255) DEFAULT NULL,
  cat_pid varchar(32) DEFAULT NULL COMMENT '上一级分类的cat_id',
  cat_level int DEFAULT 0 COMMENT '分类所在层级',
  cat_key varchar(32) DEFAULT NULL COMMENT '层级关系eg:0-1-2',
  cat_icon varchar(255) DEFAULT NULL,
  PRIMARY KEY (cat_id)
);

-- 商品
CREATE TABLE IF NOT EXISTS goods (
	goods_id varchar(32) NOT NULL,
	create_time datetime DEFAULT NULL,
	update_time datetime DEFAULT NULL,
	is_deleted bool DEFAULT FALSE COMMENT '是否删除',
	goods_name varchar(255) DEFAULT NULL,
	goods_price float NOT NULL DEFAULT 0,
	goods_number int DEFAULT 0,
	goods_weight float NOT NULL DEFAULT 0,
	goods_introduce longtext DEFAULT NULL COMMENT '富文本商品介绍',
	goods_state int DEFAULT 0,
	hot_mumber int DEFAULT 0,
	is_promote bool DEFAULT FALSE COMMENT '是否促销',
	PRIMARY KEY (goods_id)
);

-- 分类商品
CREATE TABLE IF NOT EXISTS categories_goods (
	_id varchar(32) NOT NULL,
	goods_id varchar(32) NOT NULL,
	cat_id varchar(32) NOT NULL,
	PRIMARY KEY (_id),
	FOREIGN KEY (goods_id) REFERENCES goods(goods_id),
	FOREIGN KEY (cat_id) REFERENCES categories(cat_id)
);

-- 商品图片
CREATE TABLE IF NOT EXISTS goods_pics (
	pics_id varchar(32) NOT NULL,
	goods_id varchar(32) NOT NULL,
	create_time datetime DEFAULT NULL,
	update_time datetime DEFAULT NULL,
	pics_big varchar(255) DEFAULT NULL,
	pics_mid varchar(255) DEFAULT NULL,
	pics_sma varchar(255) DEFAULT NULL,
	PRIMARY KEY (pics_id),
	FOREIGN KEY (goods_id) REFERENCES goods(goods_id)
);

-- 商品属性
CREATE TABLE IF NOT EXISTS goods_attrs (
	attr_id varchar(32) NOT NULL,
	goods_id varchar(32) NOT NULL,
	create_time datetime DEFAULT NULL,
	update_time datetime DEFAULT NULL,
	attr_value varchar(255) DEFAULT NULL,
	attr_name varchar(255) DEFAULT NULL,
	attr_sel varchar(255) DEFAULT NULL,
	PRIMARY KEY (attr_id),
	FOREIGN KEY (goods_id) REFERENCES goods(goods_id)
);

-- 轮播图
CREATE TABLE IF NOT EXISTS carousels (
	caro_id varchar(32) NOT NULL,
	create_time datetime DEFAULT NULL,
	update_time datetime DEFAULT NULL,
	image_src varchar(255) DEFAULT NULL,
	goods_id varchar(32) DEFAULT NULL,
	PRIMARY KEY (caro_id),
	FOREIGN KEY (goods_id) REFERENCES goods(goods_id)
);

-- 首页导航
CREATE TABLE IF NOT EXISTS navigations (
	nav_id varchar(32) NOT NULL,
	create_time datetime DEFAULT NULL,
	update_time datetime DEFAULT NULL,
	image_src varchar(255) DEFAULT NULL,
	nav_name varchar(255) DEFAULT NULL,
	PRIMARY KEY (nav_id)
);

-- 首页楼层标题
CREATE TABLE IF NOT EXISTS floor_titles (
	ft_id varchar(32) NOT NULL,
	create_time datetime DEFAULT NULL,
	update_time datetime DEFAULT NULL,
	image_src varchar(255) DEFAULT NULL,
	ft_name varchar(255) DEFAULT NULL,
	PRIMARY KEY (ft_id)
);

-- 首页楼层列表
CREATE TABLE IF NOT EXISTS floor_list (
	fl_id varchar(32) NOT NULL,
	create_time datetime DEFAULT NULL,
	update_time datetime DEFAULT NULL,
	image_src varchar(255) DEFAULT NULL,
	image_width varchar(255) DEFAULT NULL,
	fl_name varchar(255) DEFAULT NULL,
	ft_query varchar(255) DEFAULT NULL,
	ft_id varchar(32) NOT NULL,
	PRIMARY KEY (fl_id),
	FOREIGN KEY (ft_id) REFERENCES floor_titles(ft_id)
);

-- 订单
CREATE TABLE IF NOT EXISTS orders (
	order_id varchar(32) NOT NULL,
	create_time datetime DEFAULT NULL,
	update_time datetime DEFAULT NULL,
	is_deleted bool DEFAULT FALSE COMMENT '是否删除',
	user_id varchar(32) NOT NULL,
	order_address varchar(255) DEFAULT NULL,
	order_pay_status bool DEFAULT FALSE COMMENT '是否已支付',
	order_pay_method varchar(255) DEFAULT NULL COMMENT '支付方式',
	PRIMARY KEY (order_id),
	FOREIGN KEY (user_id) REFERENCES users(user_id)
);

-- 订单商品
CREATE TABLE IF NOT EXISTS orders_goods (
	_id varchar(32) NOT NULL,
	create_time datetime DEFAULT NULL,
	update_time datetime DEFAULT NULL,
	is_deleted bool DEFAULT FALSE COMMENT '是否删除',
	goods_id varchar(32) NOT NULL,
	order_id varchar(32) NOT NULL,
	goods_amount int DEFAULT NULL COMMENT '商品购买数量',
	PRIMARY KEY (_id),
	FOREIGN KEY (goods_id) REFERENCES goods(goods_id),
	FOREIGN KEY (order_id) REFERENCES orders(order_id)
);

-- 购物车
CREATE TABLE IF NOT EXISTS shopping_carts (
	cart_id varchar(32) NOT NULL,
	create_time datetime DEFAULT NULL,
	update_time datetime DEFAULT NULL,
	is_deleted bool DEFAULT FALSE COMMENT '是否删除',
	user_id varchar(32) NOT NULL,
	goods_id varchar(32) NOT NULL,
	PRIMARY KEY (cart_id),
	FOREIGN KEY (user_id) REFERENCES users(user_id),
	FOREIGN KEY (goods_id) REFERENCES goods(goods_id)
);

-- 收藏
CREATE TABLE IF NOT EXISTS collections (
	coll_id varchar(32) NOT NULL,
	create_time datetime DEFAULT NULL,
	update_time datetime DEFAULT NULL,
	is_deleted bool DEFAULT FALSE COMMENT '是否删除',
	user_id varchar(32) NOT NULL,
	goods_id varchar(32) NOT NULL,
	PRIMARY KEY (coll_id),
	FOREIGN KEY (user_id) REFERENCES users(user_id),
	FOREIGN KEY (goods_id) REFERENCES goods(goods_id)
);
