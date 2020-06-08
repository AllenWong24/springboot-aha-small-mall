# 啊哈小商城后端(Spring Boot)(未完成)

本项目为[小程序：啊哈小商城](https://github.com/AllenWong24/wxapp-aha-small-mall)的后端

## 相关技术

- [SpringBoot 2.3.0](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/html/)
- [Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/2.3.0.RELEASE/reference/html/#reference)
- [Flyway](https://flywaydb.org/getstarted/)

## 接口文档

### 首页

#### 轮播图

**请求接口：**/api/public/v1/home/swiperdata

**请求方式：**GET

**参数：**无

**返回示例：**

```json
{
    "message": [
        {
            "image_src": "https://api-hmugo-web.itheima.net/pyg/banner1.png",
            "open_type": "navigate",
            "goods_id": 129,
            "navigator_url": "/pages/goods_detail/index?goods_id=129"
        }
    ],
    "meta": {
        "msg": "获取成功",
        "status": 200
    }
}
```

**返回参数说明：**

| 参数名        | 类型   | 说明     |
| ------------- | ------ | -------- |
| image_src     | string | 图片路径 |
| open_type     | string | 打开方式 |
| goods_id      | number | 商品id   |
| navigator_url | string | 导航链接 |

#### 导航

**请求接口**：/api/public/v1/home/catitems

**请求方式：**GET

**参数：**无

**返回示例：**

```json
{
    "message": [
        {
            "name": "分类",
            "image_src": "https://api-hmugo-web.itheima.net/pyg/icon_index_nav_4@2x.png",
            "open_type": "switchTab",
            "navigator_url": "/pages/category/index"
        },
        {
            "name": "秒杀拍",
            "image_src": "https://api-hmugo-web.itheima.net/pyg/icon_index_nav_3@2x.png"
        },
        {
            "name": "超市购",
            "image_src": "https://api-hmugo-web.itheima.net/pyg/icon_index_nav_2@2x.png"
        },
        {
            "name": "母婴品",
            "image_src": "https://api-hmugo-web.itheima.net/pyg/icon_index_nav_1@2x.png"
        }
    ],
    "meta": {
        "msg": "获取成功",
        "status": 200
    }
}
```

**返回参数说明：**

| **参数名** | 类型   | 说明     |
| ---------- | ------ | -------- |
| name       | string | 标题名称 |
| image_src  | string | 图片路径 |

#### 楼层

**请求接口：**/api/public/v1/home/floordata

**请求方式：**GET

**参数：**无

**返回示例：**

```json
{
    "message": [
        {
            "floor_title": {
                "name": "时尚女装",
                "image_src": "https://api-hmugo-web.itheima.net/pyg/pic_floor01_title.png"
            },
            "product_list": [
                {
                    "name": "优质服饰",
                    "image_src": "https://api-hmugo-web.itheima.net/pyg/pic_floor01_1@2x.png",
                    "image_width": "232",
                    "open_type": "navigate",
                    "navigator_url": "/pages/goods_list/index?query=服饰"
                },
                {
                    "name": "春季热门",
                    "image_src": "https://api-hmugo-web.itheima.net/pyg/pic_floor01_2@2x.png",
                    "image_width": "233",
                    "open_type": "navigate",
                    "navigator_url": "/pages/goods_list/index?query=热"
                },
                {
                    "name": "爆款清仓",
                    "image_src": "https://api-hmugo-web.itheima.net/pyg/pic_floor01_3@2x.png",
                    "image_width": "233",
                    "open_type": "navigate",
                    "navigator_url": "/pages/goods_list/index?query=爆款"
                },
                {
                    "name": "倒春寒",
                    "image_src": "https://api-hmugo-web.itheima.net/pyg/pic_floor01_4@2x.png",
                    "image_width": "233",
                    "open_type": "navigate",
                    "navigator_url": "/pages/goods_list/index?query=春季"
                },
                {
                    "name": "怦然心动",
                    "image_src": "https://api-hmugo-web.itheima.net/pyg/pic_floor01_5@2x.png",
                    "image_width": "233",
                    "open_type": "navigate",
                    "navigator_url": "/pages/goods_list/index?query=心动"
                }
            ]
        },
        {
            "floor_title": {
                "name": "户外活动",
                "image_src": "https://api-hmugo-web.itheima.net/pyg/pic_floor02_title.png"
            },
            "product_list": [
                {
                    "name": "勇往直前",
                    "image_src": "https://api-hmugo-web.itheima.net/pyg/pic_floor02_1@2x.png",
                    "image_width": "232",
                    "open_type": "navigate",
                    "navigator_url": "/pages/goods_list/index?query=户外"
                },
                {
                    "name": "户外登山包",
                    "image_src": "https://api-hmugo-web.itheima.net/pyg/pic_floor02_2@2x.png",
                    "image_width": "273",
                    "open_type": "navigate",
                    "navigator_url": "/pages/goods_list/index?query=登山包"
                },
                {
                    "name": "超强手套",
                    "image_src": "https://api-hmugo-web.itheima.net/pyg/pic_floor02_3@2x.png",
                    "image_width": "193",
                    "open_type": "navigate",
                    "navigator_url": "/pages/goods_list/index?query=手套"
                },
                {
                    "name": "户外运动鞋",
                    "image_src": "https://api-hmugo-web.itheima.net/pyg/pic_floor02_4@2x.png",
                    "image_width": "193",
                    "open_type": "navigate",
                    "navigator_url": "/pages/goods_list/index?query=运动鞋"
                },
                {
                    "name": "冲锋衣系列",
                    "image_src": "https://api-hmugo-web.itheima.net/pyg/pic_floor02_5@2x.png",
                    "image_width": "273",
                    "open_type": "navigate",
                    "navigator_url": "/pages/goods_list/index?query=冲锋衣"
                }
            ]
        }
    ],
    "meta": {
        "msg": "获取成功",
        "status": 200
    }
}
```

**返回参数说明**

| 参数名        | 类型   | 说明         |
| :------------ | :----- | ------------ |
| floor_title   | string | 一级分类标题 |
| product_list  | array  | 一级分类内容 |
| name          | string | 名称         |
| image_src     | string | 图片路径     |
| image_width   | string | 图片宽度     |
| open_type     | string | 打开方式     |
| navigator_url | string | 跳转连接     |

### 分类

#### 商品分类

**请求接口：**/api/public/v1/categories

**请求方式：**GET

**参数：** 无

**返回示例**

```json
{
  "message": [
    {
      "cat_id": 1,
      "cat_name": "大家电",
      "cat_pid": 0,
      "cat_level": 0,
      "cat_deleted": false,
      "cat_icon": "",
      "children": [
        {
          "cat_id": 3,
          "cat_name": "电视",
          "cat_pid": 1,
          "cat_level": 1,
          "cat_deleted": false,
          "cat_icon": "",
          "children": [
            {
              "cat_id": 5,
              "cat_name": "曲面电视",
              "cat_pid": 3,
              "cat_level": 2,
              "cat_deleted": false,
              "cat_icon": "https://api-hmugo-web.itheima.net/full/2fb113b32f7a2b161f5ee4096c319afedc3fd5a1.jpg"
            }
          ]
        }
      ]
    }
  ],
  "meta": {
    "msg": "获取成功",
    "status": 200
  }
}
```

**返回参数说明**

| 参数名   | 类型   |          |
| :------- | :----- | -------- |
| cat_id   | int    | 分类id   |
| cat_name | string | 分类名称 |
| children | array  | 子节点   |
| cat_icon | string | 图标     |

### 商品

#### 商品列表搜索

**请求接口：**/api/public/v1/goods/search

**请求方式：**GET

**参数：**

| 参数名   | 必选 | 类型   | 说明   |
| :------- | :--- | :----- | ------ |
| query    | 否   | string | 关键字 |
| cid      | 否   | string | 分类id |
| pagenum  | 否   | number | 页码   |
| pagesize | 否   | number | 页容量 |

**返回示例**

```json
{
    "message": {
        "total": 10,
        "pagenum": 1,
        "goods": [
            {
                "goods_id": 57445,
                "cat_id": 9,
                "goods_name": "创维（Skyworth）65V9E 65英寸25核4K HDR高清智能电视",
                "goods_price": 6499,
                "goods_number": 100,
                "goods_weight": 100,
                "goods_big_logo": "",
                "goods_small_logo": "",
                "add_time": 1516663280,
                "upd_time": 1516663280,
                "hot_mumber": 0,
                "is_promote": false,
                "cat_one_id": 1,
                "cat_two_id": 3,
                "cat_three_id": 9
            }
        ]
    },
    "meta": {
        "msg": "获取成功",
        "status": 200
    }
}
```

**返回参数说明**

| 参数名           | 参数说明     |
| ---------------- | ------------ |
| total            | 总条数       |
| pagenum          | 当前页数     |
| goods_id         | 商品ID       |
| cat_id           | 分类ID       |
| goods_name       | 商品名称     |
| goods_price      | 商品价格     |
| goods_number     | 商品数量     |
| goods_weight     | 商品重量     |
| goods_big_logo   | 商品大图标   |
| goods_small_logo | 商品小图标   |
| add_time         | 商品添加时间 |
| upd_time         | 商品更新时间 |
| hot_mumber       | 热门商品数   |
| cat_one_id       | 所属一级分类 |
| cat_two_id       | 所属二级分类 |
| cat_three_id     | 所属三级分类 |

#### 商品详情

**请求接口：**/api/public/v1/goods/detail

**请求方式：**GET

**参数：**

| 参数名   | 必选 | 类型   | 说明   |
| :------- | :--- | :----- | ------ |
| goods_id | 是   | number | 商品id |

**返回示例**

```json
{
    "message": {
        "goods_id": 8888,
        "cat_id": 1085,
        "goods_name": "spike 经典武士大马士革直刀(微型) 户外野营直刀 收藏礼品刀 饰品刀具",
        "goods_price": 500,
        "goods_number": 100,
        "goods_weight": 100,
        "goods_introduce": "富文本内容",
        "goods_state": 2,
        "is_del": "0",
        "add_time": 1516361489,
        "upd_time": 1516361489,
        "delete_time": null,
        "hot_mumber": 0,
        "is_promote": false,
        "cat_one_id": 995,
        "cat_two_id": 1075,
        "cat_three_id": 1085,
        "goods_cat": "995,1075,1085",
        "pics": [
            {
                "pics_id": 38711,
                "goods_id": 8888,
                "pics_big": "http://image1.suning.cn/uimg/b2c/newcatentries/0070134290-000000000149003877_1_800x800.jpg",
                "pics_mid": "http://image1.suning.cn/uimg/b2c/newcatentries/0070134290-000000000149003877_1_400x400.jpg",
                "pics_sma": "http://image1.suning.cn/uimg/b2c/newcatentries/0070134290-000000000149003877_1_200x200.jpg",
                "pics_big_url": "http://image1.suning.cn/uimg/b2c/newcatentries/0070134290-000000000149003877_1_800x800.jpg",
                "pics_mid_url": "http://image1.suning.cn/uimg/b2c/newcatentries/0070134290-000000000149003877_1_400x400.jpg",
                "pics_sma_url": "http://image1.suning.cn/uimg/b2c/newcatentries/0070134290-000000000149003877_1_200x200.jpg"
            }
        ],
        "attrs": [
            {
                "goods_id": 8888,
                "attr_id": 9210,
                "attr_value": "户外直刀",
                "add_price": 0,
                "attr_name": "主体参数-类别",
                "attr_sel": "only",
                "attr_write": "manual",
                "attr_vals": "放大镜"
            }
        ]
    },
    "meta": {
        "msg": "获取成功",
        "status": 200
    }
}
```

**返回参数说明**

| 参数名           | 参数说明     |
| ---------------- | ------------ |
| goods_id         | 商品ID       |
| cat_id           | 分类ID       |
| goods_name       | 商品名称     |
| goods_price      | 商品价格     |
| goods_number     | 商品数量     |
| goods_weight     | 商品重量     |
| goods_big_logo   | 商品大图标   |
| goods_small_logo | 商品小图标   |
| add_time         | 商品添加时间 |
| upd_time         | 商品更新时间 |
| hot_mumber       | 热门商品数   |
| cat_one_id       | 所属一级分类 |
| cat_two_id       | 所属二级分类 |
| cat_three_id     | 所属三级分类 |
| goods_introduce  | 商品介绍     |
| pics             | 商品图片列表 |
| attrs            | 商品属性列表 |

#### 商品搜索

**请求接口：**/api/public/v1/goods/qsearch

**请求方式：**GET

**参数：**

| 参数名 | 必选 | 类型   | 说明   |
| :----- | :--- | :----- | ------ |
| query  | 是   | string | 关键字 |

**返回示例**

```json
{
    "message": [
        {
            "goods_id": 57444,
            "goods_name": "创维（Skyworth）42X6 42英寸10核智能酷开网络平板液晶电视（黑色）"
        }
    ],
    "meta": {
        "msg": "获取成功",
        "status": 200
    }
}
```

**返回参数说明**

| 参数名     | 类型   | 说明     |
| :--------- | :----- | -------- |
| goods_id   | number | 商品id   |
| goods_name | string | 商品名称 |

### 用户

#### 获取token

**请求接口：**/api/public/v1/users/wxlogin

**请求方式：**POST

**参数：**

以下字段主要用作后台服务器生成用户token所有，无特殊用意

| 参数名        | 必选 | 类型   | 参数说明                       |
| ------------- | ---- | ------ | ------------------------------ |
| encryptedData | 是   | string | 执行小程序 获取用户信息后 得到 |
| rawData       | 是   | string | 执行小程序 获取用户信息后 得到 |
| iv            | 是   | string | 执行小程序 获取用户信息后 得到 |
| signature     | 是   | string | 执行小程序 获取用户信息后 得到 |
| code          | 是   | string | 执行小程序登录后获取           |

**返回示例**

```json
{
  "message": {
    "user_id": 23,
    "user_email_code": null,
    "is_active": null,
    "user_sex": "男",
    "user_qq": "",
    "user_tel": "",
    "user_xueli": "本科",
    "user_hobby": "",
    "user_introduce": null,
    "create_time": 1562221487,
    "update_time": 1562221487,
    "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIz"
  },
  "meta": {
    "msg": "登录成功",
    "status": 200
  }
}
```

**返回参数说明**

| 参数名 | 类型   | 说明                                       |
| :----- | :----- | ------------------------------------------ |
| token  | string | 用户的唯一凭据，后期用在其他敏感接口的验证 |

### 订单

#### 创建订单

**请求接口：**/api/public/v1/my/orders/create

**请求方式：**POST

**请求头参数：**

| 参数名        | 必选 | 类型   | 说明                      |
| ------------- | ---- | ------ | ------------------------- |
| Authorization | 是   | string | 用户登录成功获取的token值 |

**请求体参数**：

| 参数名         | 必选 | 类型   | 说明       |
| :------------- | :--- | :----- | ---------- |
| order_price    | 是   | string | 订单总价格 |
| consignee_addr | 是   | string | 收货地址   |
| goods          | 是   | Array  | 订单数组   |

**goods字段说明**

| 参数名       | 必选 | 类型   | 说明       |
| ------------ | ---- | ------ | ---------- |
| goods_id     | 是   | number | 商品id     |
| goods_number | 是   | number | 购买的数量 |
| goods_price  | 是   | number | 单价       |

**返回示例**

```json
{
    "error_code": 0,
    "data": {
      "uid": "1",
      "username": "12154545",
      "name": "张三",
      "groupid": 2 ,
      "reg_time": "1436864169",
      "last_login_time": "0",
    }
  }
```

**返回参数说明**

| 参数名         | 类型   | 参数说明     |
| -------------- | ------ | ------------ |
| order_id       | string | 订单唯一ID   |
| user_id        | string | 用户ID       |
| order_number   | string | 订单编号     |
| order_price    | number | 订单价格     |
| order_pay      | number | 订单支付方式 |
| consignee_addr | string | 订单地址     |
| pay_status     | number | 订单支付状态 |

#### 查看订单支付状态

**请求接口：**/api/public/v1/my/orders/chkOrder

**请求方式：**POST

**请求头参数：**

| 参数名        | 必选 | 类型   | 说明                      |
| ------------- | ---- | ------ | ------------------------- |
| Authorization | 是   | string | 用户登录成功获取的token值 |

**请求体参数**：

| 参数名       | 必选 | 类型   | 说明     |
| ------------ | ---- | ------ | -------- |
| order_number | 是   | string | 订单编号 |

**返回示例**

```json
{
  "message": "支付成功",
  "meta": {
    "msg": "验证成功",
    "status": 200
  }
}
```

#### 历史订单查询

**请求URL：**/api/public/v1/my/orders/all

**请求方式：**GET

**请求头参数：**

| 参数名        | 必选 | 类型   | 说明                      |
| ------------- | ---- | ------ | ------------------------- |
| Authorization | 是   | string | 用户登录成功获取的token值 |

**请求体参数**：

| 参数名 | 必选 | 类型   | 说明                         |
| ------ | ---- | ------ | ---------------------------- |
| type   | 是   | number | 1:全部订单 2:待付款 3:待发货 |

**返回示例**

```json
{
  "message": {
    "count": 1,
    "orders": [
      {
        "order_id": 428,
        "user_id": 23,
        "order_number": "HMDD20190802000000000428",
        "order_price": 13999,
        "order_pay": "0",
        "is_send": "否",
        "trade_no": "",
        "order_fapiao_title": "个人",
        "order_fapiao_company": "",
        "order_fapiao_content": "",
        "consignee_addr": "广东省广州市xx区xx路9527号",
        "pay_status": "1",
        "create_time": 1564731518,
        "update_time": 1564731518,
        "order_detail": null,
        "goods": [
          {
            "id": 717,
            "order_id": 428,
            "goods_id": 43986,
            "goods_price": 13999,
            "goods_number": 1,
            "goods_total_price": 13999,
            "goods_name": "海信(Hisense)LED55MU9600X3DUC 55英寸 4K超高清量子点电视 ULED画质 VIDAA系统",
            "goods_small_logo": "http://image5.suning.cn/uimg/b2c/newcatentries/0000000000-000000000160455569_1_400x400.jpg"
          }
        ],
        "total_count": 1,
        "total_price": 13999
      }
    ]
  },
  "meta": {
    "msg": "获取订单列表成功",
    "status": 200
  }
}
```