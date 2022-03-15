package com.xiaoguangbiao.pattern.builder.demo1;

/**
 * @version v1.0
 * @ClassName: OfoBuilder
 * @Description: ofo单车构建者，用来构建ofo单车
 * @Author: xiaoguangbiao-github
 */
public class OfoBuilder extends Builder {
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    public Bike createBike() {
        return bike;
    }
}
