package com.mytests.spring.springdebuggerpropsinlaysyaml;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;


@ConfigurationProperties(prefix = "custom.config")
public class SomeConfigProperties {


    String prop1;
    String prop2;
    List<String> prop3;
    Map<String, String> prop4;
    SomeInnerPojo pojo;

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public List<String> getProp3() {
        return prop3;
    }

    public void setProp3(List<String> prop3) {
        this.prop3 = prop3;
    }

    public Map<String, String> getProp4() {
        return prop4;
    }

    public void setProp4(Map<String, String> prop4) {
        this.prop4 = prop4;
    }

    public SomeInnerPojo getPojo() {
        return pojo;
    }

    public void setPojo(SomeInnerPojo pojo) {
        this.pojo = pojo;
    }

    public static class SomeInnerPojo {
        String pojoProp1;
        List<String> pojoProp2;

        public String getPojoProp1() {
            return pojoProp1;
        }

        public void setPojoProp1(String pojoProp1) {
            this.pojoProp1 = pojoProp1;
        }

        public List<String> getPojoProp2() {
            return pojoProp2;
        }

        public void setPojoProp2(List<String> pojoProp2) {
            this.pojoProp2 = pojoProp2;
        }
    }
}
