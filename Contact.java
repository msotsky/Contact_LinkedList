public class Contact {
    private String name;
    private int month;
    private int day;

    public Contact(String name, int month, int day) throws IllegalArgumentException {
        if(month > 12){
            IllegalArgumentException e = new IllegalArgumentException("Invalid month");
            throw e;
        }
        this.name = name;
        this.month = month;
        this.day = day;
    }

    public String toString(){
        return name + "\t" + "Month: " + month + "\t" + "Day: " + day;
    }

    public int compareTo(Contact that) {
        if(this.name.compareTo(that.name) == 0){
            return 0;
        }
        if(this.name.compareTo(that.name) == 1){
            return 1;
        }
        else{
            return -1;
        }
    }

    
}
