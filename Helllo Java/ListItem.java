public abstract class ListItem {
    protected ListItem leftLink;
    protected ListItem rightLink;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }
     abstract ListItem next();

     abstract ListItem setNext();
    abstract ListItem previous();

    abstract ListItem setPrevious();
    abstract ListItem compareTo();

    public Object getValue(){
        return this.value;
    }
    public void setValue(Object a){
        this.value =a;
    }
}
