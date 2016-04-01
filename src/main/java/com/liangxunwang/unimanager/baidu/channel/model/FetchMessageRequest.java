package com.liangxunwang.unimanager.baidu.channel.model;


import com.liangxunwang.unimanager.baidu.annotation.HttpParamKeyName;
import com.liangxunwang.unimanager.baidu.annotation.HttpPathKeyName;
import com.liangxunwang.unimanager.baidu.annotation.R;
import com.liangxunwang.unimanager.baidu.channel.constants.BaiduChannelConstants;

public class FetchMessageRequest extends ChannelRequest {

    @HttpParamKeyName(name = BaiduChannelConstants.USER_ID, param = R.REQUIRE)
    private String userId;

    @HttpPathKeyName(param = R.OPTIONAL)
    private Long channelId = null;

    @HttpParamKeyName(name = BaiduChannelConstants.START, param = R.OPTIONAL)
    private Integer start = new Integer(0);

    @HttpParamKeyName(name = BaiduChannelConstants.LIMIT, param = R.OPTIONAL)
    private Integer limit = new Integer(0);

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

}
