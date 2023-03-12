create table ry_fast.t_exam
(
    id          bigint auto_increment comment '问卷id'
        primary key,
    name        varchar(255) default '' null comment '问卷名称',
    type        varchar(255) default '' null comment '问卷类型',
    dept        varchar(255) default '' null comment '部门',
    create_user bigint                  null comment '创建人',
    create_time datetime                null comment '创建时间',
    update_user bigint                  null comment '更新人',
    update_time datetime                null comment '更新时间',
    remark      varchar(500)            null comment '描述'
)
    comment '问卷表';

/*-----------------------2023-02-10，begin----------------------------*/
/*产品表*/
create table ry_fast.t_product
(
    id          bigint auto_increment comment 'id' primary key,
    name        varchar(255) default '' null comment '名称',
    barcode        varchar(255) default '' null comment '二维码',
    goods_code        varchar(255) default '' null comment '货号',
    en_name        varchar(255) default '' null comment '英文名',
    pinyin_name        varchar(255) default '' null comment '拼音缩写',
    type        varchar(255) default '' null comment '类型',
    category1        varchar(255) default '' null comment '分类1',
    category2        varchar(255) default '' null comment '分类2',
    price        double default 0.0 null comment '售价',
    ori_price        double default 0.0 null comment '原价',
    cost_price        double default 0.0 null comment '成本价',
    mem_price1        double default 0.0 null comment '白银会员价',
    mem_price2        double default 0.0 null comment '黄金会员价',
    mem_price3        double default 0.0 null comment '钻石会员价',
    pic_main    varchar(255) default '' null comment '主图',
    pic_main_s    varchar(255) default '' null comment '主图缩略图',
    unit        varchar(255) default '' null comment '单位',
    title        varchar(255) default '' null comment '标题',
    weight        varchar(255) default '' null comment '重量',
    supplier        varchar(255) default '' null comment '供应商',
    product_area        varchar(255) default '' null comment '产地',
    tag        varchar(255) default '' null comment '标签',
    description        text  null comment '描述',
    stock_quantity        double default 0.0 null comment '库存数量',
    create_user bigint                  null comment '创建人',
    create_time datetime                null comment '创建时间',
    update_user bigint                  null comment '更新人',
    update_time datetime                null comment '更新时间',
    remark      varchar(500)            null comment '备注'
)
    comment '产品表';

/** 分类： line1：
  蔬菜豆制品---1
  时令水果---2
  肉禽蛋水产---3
  粮油调味---4
  冷冻冷藏---5
  酒水乳饮---6
  line2：
  休闲食品
  个护清洁
  日常百货
 */

create table ry_fast.t_customer
(
    id          bigint auto_increment comment 'id' primary key,
    name        varchar(255) default '' null comment '名称',
    code        varchar(255) default '' null comment '编号',
    mobile        varchar(255) default '' null comment '手机号',
    mobile2        varchar(255) default '' null comment '手机号2',
    type        varchar(255) default '' null comment '类型',
    weixin_name        varchar(255) default '' null comment '微信名',
    mini_openid        varchar(255) default '' null comment '小程序openid',
    mini_unionid        varchar(255) default '' null comment '小程序unionid',
    pic_main    varchar(255) default '' null comment '主图',
    pic_main_s    varchar(255) default '' null comment '主图缩略图',
    province        varchar(255) default '' null comment '省',
    city        varchar(255) default '' null comment '市',
    district        varchar(255) default '' null comment '区县',
    village        varchar(255) default '' null comment '村',
    tag        varchar(255) default '' null comment '标签',
    address        varchar(255) default '' null comment '街道门牌',
    address_all        varchar(255) default '' null comment '完整地址',
    car_code        varchar(255) default '' null comment '车牌',
    create_user bigint                  null comment '创建人',
    create_time datetime                null comment '创建时间',
    update_user bigint                  null comment '更新人',
    update_time datetime                null comment '更新时间',
    remark      varchar(500)            null comment '备注'
)
    comment '客户表';
create table ry_fast.t_order
(
    id          bigint auto_increment comment 'id' primary key,
    code        varchar(255) default '' null comment '订单编号',
    customer_id        bigint null comment '客户id',
    status        varchar(255) default '' null comment '订单状态',
    type        varchar(255) default '' null comment '类型',
    quantity        double default 0.0 null comment '数量',
    money        double default 0.0 null comment '金额',
    discounts_money        double default 0.0 null comment '优惠金额',
    order_time datetime                null comment '下单时间',
    target_time datetime                null comment '客户指定配送时间',
    plan_send_time datetime                null comment '商家预计配送时间',
    title        varchar(255) default '' null comment '订单名称',

    pay_status        varchar(255) default '' null comment '付款状态',
    pay_money        double default 0.0 null comment '付款金额',
    pay_time datetime                null comment '付款时间',

    send_status        varchar(255) default '' null comment '配送状态',
    send_user bigint                  null comment '创建人',
    send_time datetime                null comment '配送时间',
    province        varchar(255) default '' null comment '省',
    city        varchar(255) default '' null comment '市',
    district        varchar(255) default '' null comment '区县',
    village        varchar(255) default '' null comment '村',
    tag        varchar(255) default '' null comment '标签',
    address        varchar(255) default '' null comment '街道门牌',
    address_all        varchar(255) default '' null comment '完整地址',
    end_user bigint                  null comment '结单人',
    end_time datetime                null comment '结单时间',

    create_user bigint                  null comment '创建人',
    create_time datetime                null comment '创建时间',
    update_user bigint                  null comment '更新人',
    update_time datetime                null comment '更新时间',
    remark      varchar(500)            null comment '备注'
)
    comment '订单表';
create table ry_fast.t_order_item
(
    id          bigint auto_increment comment 'id' primary key,
    order_id        bigint null comment '订单id',
    product_id        bigint null comment '产品id',
    product_name        varchar(255) default '' null comment '产品名称',

    price        double default 0.0 null comment '单价',
    quantity        double default 0.0 null comment '数量',
    cost_price        double default 0.0 null comment '成本价',
    money        double default 0.0 null comment '金额',

    code        varchar(255) default '' null comment '编号',

    create_user bigint                  null comment '创建人',
    create_time datetime                null comment '创建时间',
    update_user bigint                  null comment '更新人',
    update_time datetime                null comment '更新时间',
    remark      varchar(500)            null comment '备注'
)
    comment '订单明细表';
/*-----------------------2023-02-10，end----------------------------*/


/*-----------------------2023-02-19，begin----------------------------*/
create table ry_fast.t_homework
(
    id          bigint auto_increment comment 'id' primary key,
    name        varchar(255) default '' null comment '作业名',
    worker        varchar(255) default '' null comment '负责人',
    auditor        varchar(255) default '' null comment '审核人',
    class_name        varchar(255) default '' null comment '课程',/*语文，数学，英语，围棋，陶笛，阅读，体育*/
    type        varchar(255) default '' null comment '类型',/*作业，日程*/
    freq        varchar(255) default '' null comment '周期',/*每天，工作日，每周，周末，每月，每年，一次性，不定时*/

    freq_str varchar(255) default '' null comment '周期时间',
    plan_date datetime                null comment '计划时间',
    plan_time        int default 0 null comment '计划用时',/*单位，秒*/
    display_order        varchar(255) default '' null comment '顺序',
    priority        varchar(255) default '' null comment '优先级',
    alert        varchar(255) default '' null comment '提醒',
    alert_date datetime                null comment '提醒时间',

    create_user bigint                  null comment '创建人',
    create_time datetime                null comment '创建时间',
    update_user bigint                  null comment '更新人',
    update_time datetime                null comment '更新时间',
    remark      varchar(500)            null comment '备注'
)
    comment '作业表';
create table ry_fast.t_homework_record
(
    id          bigint auto_increment comment 'id' primary key,
    homework_id        bigint null comment '作业id',
    worker        varchar(255) default '' null comment '负责人',
    auditor        varchar(255) default '' null comment '审核人',
    result        varchar(255) default '' null comment '结果',
    key_content        varchar(255) default '' null comment '重点',
    begin_date datetime                null comment '开始时间',
    end_date datetime                null comment '完成时间',
    use_time        int default 0 null comment '用时',/*单位，秒*/

    create_user bigint                  null comment '创建人',
    create_time datetime                null comment '创建时间',
    update_user bigint                  null comment '更新人',
    update_time datetime                null comment '更新时间',
    remark      varchar(500)            null comment '备注'
)
    comment '作业计时表';
/*-----------------------2023-02-19，end----------------------------*/


/*-----------------------2023-03-12，end----------------------------*/
create table ry_fast.t_note
(
    id          bigint auto_increment comment '笔记id'
        primary key,
    title        varchar(255) default '' null comment '标题',
    context        varchar(255) default '' null comment '内容',
    author        varchar(255) default '' null comment '作者',
    type        varchar(255) default '' null comment '类型',/*常用口语，励志，教育，感悟，诗句，随笔*/
    url        varchar(255) default '' null comment '网址',
    record_time datetime                null comment '操作时间',
    create_user bigint                  null comment '创建人',
    create_time datetime                null comment '创建时间',
    update_user bigint                  null comment '更新人',
    update_time datetime                null comment '更新时间',
    remark      varchar(500)            null comment '描述'
)
    comment '笔记表';
/*-----------------------2023-03-12，end----------------------------*/