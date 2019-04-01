package com.hao.base.vo;

/**
 * @author hao
 * @date 2019/3/31 21:11
 * description 返回结果代码
 */
public enum ResponseCodeVO {

    /**
     * 返回码
     */
    SUCCESS("成功", "000"),
    FAILURE("失败", "001"),
    EXCEPTION("系统异常", "002"),
    PARAMISEMTPY("参数不能为空", "003");

    /**
     * 名字
     */
    private String name;

    /**
     * 代码
     */
    private String code;

    ResponseCodeVO(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    @Override
    public String toString() {
        return "ResponseCodeVO{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
