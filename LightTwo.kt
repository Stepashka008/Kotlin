class LightTwo (name: String, status: Boolean, color: String) : SmartDevice(name, status, color) {

    private var light: Int = 0;
    constructor(name: String, status: Boolean, color: String, light: Int) : this(name, status, color){
        this.light = light;
    }
    // Геттер и Сеттер
    var Light: Int // Свойство
        set(value) {
            if (value > 100){
                println("При такой светлости устройство взорвётся, мы сделаем его светлость на 100")
                light = 100;
            }
            else if (value < 0){
                println("Устройство не может светить отрицательно, мы сделаем свет на 0")
                light = 0;
            }
            else{
                light = value;
            }
        }
        get() = light;
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