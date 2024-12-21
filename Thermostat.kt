class Thermostat (name: String, status: Boolean, color: String, private var temperature: Int) :
    Device(name, status, color){ // Наследуем базовый класс

    fun getTemperature(): Int{
        return temperature;
    }
    fun setTemperature(temperature: Int){
        this.temperature = temperature;
    }
    override fun toString(): String{ // Получение полного описания объекта // Переопределенный метод
        return super.toString() + ", Температура: $temperature";
    }
    override fun checkStatus(): String{
        if (getStatus()) return getName() + ": включен";
        return getName() + ": выключен";
    }
}