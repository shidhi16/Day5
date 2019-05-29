package DAY5;

public class Student extends Person
{
    private String Sid;
    private String Course;
    private float Marksof5sub;

    public String getSid() {
        return Sid;
    }

    public void setSid(String sid) {
        Sid = sid;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public float getMarksof5sub() {
        return Marksof5sub;
    }

    public void setMarksof5sub(float marksof5sub) {
        Marksof5sub = marksof5sub;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float total) {
        Total = total;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }

    private float Total;
    private float percentage;
    private String Result;


    public void calctotal()
    {
        this.Total = 0;
        System.out.println("Marksof5sub"[0]);
        for(int i=0; i<this.Marksof5sub; i++)
        {
            this.Total =this.Total + Marksof5sub[i];
        }
    }
    public void calcper()
    {
        this.percentage = 0;
        percentage = this.Total / this.Marksof5sub.length;
    }
}