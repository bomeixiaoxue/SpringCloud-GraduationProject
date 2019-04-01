package com.hao.base.common;

/**
 * @author hao
 * @date 2019/3/31 17:14
 * description 微服务静态参数
 */
public class MicroServiceApi {

    /**
     * 服务名
     */
    public final static String NEWS_SERVICE_NAME = "news-service";
    public final static String ACTIVITY_SERVICE_NAME = "activity-service";
    public final static String COMPETITION_SERVICE_NAME = "competition-service";
    public final static String USER_SERVICE_NAME = "user-service";
    public final static String CHAT_SERVICE_NAME = "chat-service";

    /**
     * 新闻服务api接口
     */
    public final static String API_NEWS_ADD = "http://" + NEWS_SERVICE_NAME + "/news/add";
    public final static String API_NEWS_DELETE = "http://" + NEWS_SERVICE_NAME + "/news/delete";
    public final static String API_NEWS_UPDATE = "http://" + NEWS_SERVICE_NAME + "/news/update";
    public final static String API_NEWS_GET = "http://" + NEWS_SERVICE_NAME + "/news/get";

    public final static String API_NEWS_ADDList = "http://" + NEWS_SERVICE_NAME + "/news/addList";
    public final static String API_NEWS_DELETEList = "http://" + NEWS_SERVICE_NAME + "/news/deleteList";
    public final static String API_NEWS_UPDATEList= "http://" + NEWS_SERVICE_NAME + "/news/updateList";
    public final static String API_NEWS_GET_LIST = "http://" + NEWS_SERVICE_NAME + "/news/getList";

    /**
     * 活动服务api接口
     */
    public final static String API_ACTIVITY_ADD = "http://" + ACTIVITY_SERVICE_NAME + "/activity/add";
    public final static String API_ACTIVITY_DELETE = "http://" + ACTIVITY_SERVICE_NAME + "/activity/delete";
    public final static String API_ACTIVITY_UPDATE = "http://" + ACTIVITY_SERVICE_NAME + "/activity/update";
    public final static String API_ACTIVITY_GET = "http://" + ACTIVITY_SERVICE_NAME + "/activity/get";

    public final static String API_ACTIVITY_ADDLIST = "http://" + ACTIVITY_SERVICE_NAME + "/activity/addList";
    public final static String API_ACTIVITY_DELETELIST = "http://" + ACTIVITY_SERVICE_NAME + "/activity/deleteList";
    public final static String API_ACTIVITY_UPDATELIST = "http://" + ACTIVITY_SERVICE_NAME + "/activity/updateList";
    public final static String API_ACTIVITY_GET_LIST = "http://" + ACTIVITY_SERVICE_NAME + "/activity/getList";

    /**
     * 赛程服务api接口
     */
    public final static String API_COMPETITION_ADD = "http://" + COMPETITION_SERVICE_NAME + "/competition/add";
    public final static String API_COMPETITION_DELETE = "http://" + COMPETITION_SERVICE_NAME + "/competition/delete";
    public final static String API_COMPETITION_UPDATE = "http://" + COMPETITION_SERVICE_NAME + "/competition/update";
    public final static String API_COMPETITION_GET = "http://" + COMPETITION_SERVICE_NAME + "/competition/get";

    public final static String API_COMPETITION_ADDLIST = "http://" + COMPETITION_SERVICE_NAME + "/competition/addList";
    public final static String API_COMPETITION_DELETELIST = "http://" + COMPETITION_SERVICE_NAME + "/competition/deleteList";
    public final static String API_COMPETITION_UPDATELIST = "http://" + COMPETITION_SERVICE_NAME + "/competition/updateList";
    public final static String API_COMPETITION_GETLIST = "http://" + COMPETITION_SERVICE_NAME + "/competition/getList";

    /**
     * 用户管理服务api接口
     */
    public final static String API_USER_ADD = "http://" + USER_SERVICE_NAME + "/user/add";
    public final static String API_USER_DELETE = "http://" + USER_SERVICE_NAME + "/user/delete";
    public final static String API_USER_UPDATE = "http://" + USER_SERVICE_NAME + "/user/update";
    public final static String API_USER_GET = "http://" + USER_SERVICE_NAME + "/user/get";

    public final static String API_USER_ADDLIST = "http://" + USER_SERVICE_NAME + "/user/addList";
    public final static String API_USER_DELETELIST = "http://" + USER_SERVICE_NAME + "/user/deleteList";
    public final static String API_USER_UPDATELIST = "http://" + USER_SERVICE_NAME + "/user/updateList";
    public final static String API_USER_GETLIST = "http://" + USER_SERVICE_NAME + "/user/getList";

    /**
     * 聊天服务api接口
     */
    public final static String API_CHAT_ADD = "http://" + CHAT_SERVICE_NAME + "/chat/add";
    public final static String API_CHAT_DELETE = "http://" + CHAT_SERVICE_NAME + "/chat/delete";
    public final static String API_CHAT_UPDATE = "http://" + CHAT_SERVICE_NAME + "/chat/update";
    public final static String API_CHAT_GET_ONE = "http://" + CHAT_SERVICE_NAME + "/chat/get";

    public final static String API_CHAT_ADDLIST = "http://" + CHAT_SERVICE_NAME + "/chat/addList";
    public final static String API_CHAT_DELETELIST = "http://" + CHAT_SERVICE_NAME + "/chat/deleteList";
    public final static String API_CHAT_UPDATELIST = "http://" + CHAT_SERVICE_NAME + "/chat/updateList";
    public final static String API_CHAT_GETLIST = "http://" + CHAT_SERVICE_NAME + "/chat/getList";

}
