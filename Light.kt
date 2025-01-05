class Light (name: String, status: Boolean, color: String) : Device(name, status, color){ // Наследуем базовый класс

    private var brightness: Int = 0;
    // this - Передаем аргументы основному конструктору
    constructor(name: String, status: Boolean, color: String, brightness: Int) : this(name, status, color){
        this.brightness = brightness;
    }

    var Brightness: Int
        set(value) {
            if (value > 100){
                println("При такой светлости устройство взорвётся, мы сделаем его светлость на 100")
                brightness = 100;
            }
            else if (value < 0){
                println("Устройство не может светить отрицательно, мы сделаем свет на 0")
                brightness = 0;
            }
            else{
                brightness = value;
            }
        }
        get() = brightness;
    // Получение полного описания объекта // Переопределенный метод
    override fun toString(): String{
        return super.toString() + ", Светлость: $brightness";
    }
    override fun checkStatus(): String{
        if (Status) return "$Name: включен";
        return "$Name: выключен";
    }
}