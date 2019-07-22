package patterns.creational.singleton.register;

/**
 * 注册单例--枚举式
 *
 */
public enum EnumSingleton {

    INSTANCE;

    private Object date;

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
