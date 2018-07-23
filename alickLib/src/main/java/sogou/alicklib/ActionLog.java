package sogou.alicklib;

/**
 * 功能:
 * 作者: 崔兴旺
 * 日期: 2018/7/23
 * 备注:
 */
public class ActionLog {
    private int type;
    private String name;

    public ActionLog() {
    }

    public ActionLog(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
