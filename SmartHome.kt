class SmartHome {
    private var deviceList: ArrayList<Device> = ArrayList<Device>();

    fun addDevice(name: String, status: Boolean, color: String){ // Добавление устройства
        deviceList.add(Device(name, status, color));
    }
    fun addLight(name: String, status: Boolean, color: String, brightness: Int){ // Добавление чего-то светящегося
        deviceList.add(Light(name, status, color, brightness));
    }
    fun addThermostat(name: String, status: Boolean, color: String, temperature: Int){ // Добавление чего-то температурного
        deviceList.add(Thermostat(name, status, color, temperature));
    }
    fun changeStatus(name: String){ // Изменение статуса
        findDevice(name).setStatus(!findDevice(name).getStatus());
    }
    fun checkStatus(name: String){ // Проверка статуса
        println(findDevice(name).checkStatus());
    }
    fun toStringDevice(name: String){ // Вывод всего устройства
        println(findDevice(name).toString());
    }
    fun changeBrightnessOrTemperature(name: String, changes: Int){ // Изменяем температуру или светлость
        val dev = findDevice(name);
        if (dev is Light){
             dev.setBrightness(changes);
        }
        else if (dev is Thermostat){
            dev.setTemperature(changes);
        }
        else{
            println("Извините у этого устройства нечего изменять")
        }
    }
    private fun findDevice(name: String): Device{ // Находим устройство
        for (dev in deviceList){
            if (dev.getName() == name){
                return dev;
            }
        }
        return TODO("Не найдено"); // надо поменять
    }
}