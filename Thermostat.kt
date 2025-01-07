class Thermostat (name: String, status: Boolean, color: String) : Device(name, status, color), Controllable { // Наследуем базовый класс

    private var temperature: Int = 0;
    // this - Передаем аргументы основному конструктору
    constructor(name: String, status: Boolean, color: String, temperature: Int) : this(name, status, color){
        this.temperature = temperature;
    }

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
    // Получение полного описания объекта // Переопределенный метод
    override fun toString(): String{ // Получение полного описания объекта // Переопределенный метод
        return super.toString() + ", Температура: $temperature";
    }
    // Добавляем дополнительный метод для переопределения функционала классов при их наследовании // Шаг 8 задача 5
    override fun checkStatus(): String{
        if (Status) return "$Name: включен";
        return "$Name: выключен";
    }
    // Переписываем все интерфейсы для работы в стиле Kotlin // Шаг 8 задача 4
    // Реализуем методы интерфейса
    override fun getting(): Int {
        return temperature
    }
    override fun setting(field: Int) {
        this.temperature = field;
    }
}