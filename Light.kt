class Light (name: String, status: Boolean, color: String, private var brightness: Int) :
    Device(name, status, color){ // Наследуем базовый класс

    fun getBrightness(): Int{
        return brightness;
    }
    fun setBrightness(brightness: Int){
        this.brightness = brightness;
    }
    // Получение полного описания объекта // Переопределенный метод
    override fun toString(): String{
        return super.toString() + ", Светлость: $brightness";
    }
    override fun checkStatus(): String{
        if (getStatus()) return getName() + ": включен";
        return getName() + ": выключен";
    }
}