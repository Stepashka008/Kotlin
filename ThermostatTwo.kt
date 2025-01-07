class ThermostatTwo(name: String, status: Boolean, color: String) : SmartDevice(name, status, color) {

    private var temperature: Int = 0;
    constructor(name: String, status: Boolean, color: String, temperature: Int) : this(name, status, color){
        this.temperature = temperature;
    }
    // Геттер и Сеттер
    var Temperature: Int // Свойство
        set(value) {
            if (value > 100){
                println("При такой температуре устройство расплавиться, мы сделаем его температуру на 99")
                temperature = 100;
            }
            else if (value < 0){
                println("При такой температуре устройство замерзнет, мы сделаем его температуру на 0")
                temperature = 0;
            }
            else{
                temperature = value;
            }
        }
        get() = temperature;
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
        return "Name: $name, Status: $status, Color: $color, Thermostat: $temperature";
    }
}