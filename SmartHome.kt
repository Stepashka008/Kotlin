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
    // Вывод всего устройства в зависимости от его типа
    fun toStringDevice(name: String){
        when (val dev = findDevice(name)){ // Если dev равен такому типу
            is Light -> { println(dev.toString()); println("Вы вывели светящееся устройство"); }
            is Thermostat -> { println(dev.toString()); println("Вы вывели нагревающееся устройство"); }
        }
    }
    // Изменяем температуру или светлость в зависимости от типа
    fun changeBrightnessOrTemperature(name: String, changes: Int){
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
    // Находим устройство
    private fun findDevice(name: String): Device{
        for (dev in deviceList){
            if (dev.getName() == name){
                return dev;
            }
        }
        return TODO("Не найдено"); // надо поменять
    }
    // Метод циклического обновления всех устройств (включение или выключения)
    fun uploadedDevices(OnOrOff: Boolean){
        val checkOnOrOff: String = if (OnOrOff) "включено" else "выключено";
        for (dev in deviceList){
            dev.setStatus(OnOrOff);
            println("Устройство ${dev.getName()} включено, статус: ${dev.getStatus()}");
        }
    }
}