package demo;

public class demo_Get_Set {
        public String name;
        public String code;
        public int birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public demo_Get_Set(String name, String code, int birthday) {
        this.name = name;
        this.code = code;
        this.birthday = birthday;


    }
}
