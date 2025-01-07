class Light (name: String, status: Boolean, color: String) : Device(name, status, color), Controllable{ // Наследуем базовый класс

    private var brightness: Int = 0;
    // this - Передаем аргументы основному конструктору
    constructor(name: String, status: Boolean, color: String, brightness: Int) : this(name, status, color){
        this.brightness = brightness;
    }

    var Brightness: Int // Свойство
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
    // Добавляем дополнительный метод для переопределения функционала классов при их наследовании // Шаг 8 задача 5
    override fun checkStatus(): String{
        if (Status) return "$Name: включен";
        return "$Name: выключен";
    }
    // Переписываем все интерфейсы для работы в стиле Kotlin // Шаг 8 задача 4
    // Реализуем методы интерфейса
    override fun getting(): Int {
        return brightness
    }
    override fun setting(field: Int) {
        this.brightness = field;
    }
}