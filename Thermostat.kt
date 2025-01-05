class Thermostat (name: String, status: Boolean, color: String) : Device(name, status, color){ // Наследуем базовый класс

    private var temperature: Int = 0;
    // this - Передаем аргументы основному конструктору
    constructor(name: String, status: Boolean, color: String, temperature: Int) : this(name, status, color){
        this.temperature = temperature;
    }

    var Temperature: Int
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
    // Получение полного описания объекта // Переопределенный метод
    override fun toString(): String{ // Получение полного описания объекта // Переопределенный метод
        return super.toString() + ", Температура: $temperature";
    }
    override fun checkStatus(): String{
        if (Status) return "$Name: включен";
        return "$Name: выключен";
    }
}