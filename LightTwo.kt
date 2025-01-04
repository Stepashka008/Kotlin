class LightTwo
    (name: String, status: Boolean, color: String, private var light: Int) :
    SmartDevice(name, status, color) {
    // Обязательная реализация абстрактных методов
    override fun receiveName(): String{
        return name;
    }
    override fun receiveStatus(): Boolean{
        return status;
    }
    override fun receiveColor(): String{
        return color;
    }
    override fun changeName(name: String){
        this.name = name;
    }
    override fun changeStatus(status: Boolean){
        this.status = status;
    }
    override fun changeColor(color: String){
        this.color = color;
    }
    override fun toStr(): String{
        return "Name: $name, Status: $status, Color: $color, Light: $light";
    }
}