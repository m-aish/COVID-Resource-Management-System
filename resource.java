abstract class resource {
    String type;
    abstract void display();
    public resource(String type){
    this.type = type;
    }
    String getType(){
    return type;
    }
    }