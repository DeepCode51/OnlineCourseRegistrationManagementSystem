const menu = {
    list() {
        return [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"课程类型","menuJump":"列表","tableName":"kechengleixing"}],"menu":"课程类型管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"课程信息","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"课程购买","menuJump":"列表","tableName":"kechenggoumai"}],"menu":"课程购买管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"退课","menuJump":"列表","tableName":"tuike"}],"menu":"退课管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"课程评价","menuJump":"列表","tableName":"kechengpingjia"}],"menu":"课程评价管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"课程资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","购买"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"}],"roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","修改","删除","支付","退课","评价"],"menu":"课程购买","menuJump":"列表","tableName":"kechenggoumai"}],"menu":"课程购买管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"退课","menuJump":"列表","tableName":"tuike"}],"menu":"退课管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"课程评价","menuJump":"列表","tableName":"kechengpingjia"}],"menu":"课程评价管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","购买"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"}],"roleName":"用户","tableName":"yonghu"}]
    }
}
export default menu;
