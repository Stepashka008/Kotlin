class SmartHome {
    private var deviceList: ArrayList<Device> = ArrayList<Device>();

    fun addDevice(name: String, status: Boolean, color: String){ // Добавление устройства
        deviceList.add(Device(name, status, color));
    }
    fun addLight(name: String, status: Boolean, color: String, brightness: Int){ // Добавление чего-то светящегося
        deviceList.add(Light(name, status, color, brightness));
        checkTempAndLight(name); // Проверка на температуру или свет
    }
    fun addThermostat(name: String, status: Boolean, color: String, temperature: Int){ // Добавление чего-то температурного
        deviceList.add(Thermostat(name, status, color, temperature));
        checkTempAndLight(name); // Проверка на температуру или свет
    }
    fun changeStatus(name: String){ // Изменение статуса
        findDevice(name)?.Status = !findDevice(name)?.Status!!;
    }
    fun checkStatus(name: String){ // Проверка статуса
        println(findDevice(name)?.checkStatus());
    }
    // Вывод всего устройства в зависимости от его типа
    fun toStringDevice(name: String){
        when (val dev = findDevice(name)){ // Если dev равен такому типу
            is Light -> { println(dev.toString()); println("Вы вывели светящееся устройство"); }
            is Thermostat -> { println(dev.toString()); println("Вы вывели нагревающееся устройство"); }
            else -> println(dev.toString());
        }
    }
    // Изменяем температуру или светлость в зависимости от типа
    fun changeBrightnessOrTemperature(name: String, changes: Int){
        findDevice(name)?.let { dev ->
            when (dev) {
                is Light -> {
                    dev.Brightness = changes
                    checkTempAndLight(name)
                }
                is Thermostat -> {
                    dev.Temperature = changes
                    checkTempAndLight(name)
                }
                else -> println("Извините у этого устройства нечего изменять")
            }
        } ?: println("Устройство не найдено")
    }
    // Находим устройство // Шаг 7 задача 4
    private fun findDevice(name: String): Device? {
        for (dev in deviceList){
            if (dev.Name == name) return dev;
        }
        return null;
    }
    // Метод циклического обновления всех устройств (включение или выключения)
    fun uploadedDevices(OnOrOff: Boolean){
        println();
        val checkOnOrOff: String = if (OnOrOff) "включено" else "выключено";
        for (dev in deviceList){
            if (checkTempAndLight(dev.Name)){ // Проверка на температуру или свет
                dev.Status = OnOrOff;
                println("Устройство ${dev.Name} $checkOnOrOff, статус: ${dev.Status}");
            }
        }
    }
    // Метод отключения устройства при определенных условиях
    private fun checkTempAndLight(name: String): Boolean {
        findDevice(name)?.let { dev ->
            when (dev) {
                is Light -> {
                    if (dev.Brightness < 0) {
                        dev.Status = false;
                        println("Света нету, статус устройства ${dev.Name}: ${dev.Status}")
                        return false
                    } else if (dev.Brightness > 100) {
                        dev.Status = false;
                        println("Устройство сгорело, статус устройства ${dev.Name}: ${dev.Status}")
                        return false;
                    }
                }

                is Thermostat -> {
                    if (dev.Temperature < -29) {
                        dev.Status = false;
                        println("Устройство замерзло, статус устройства ${dev.Name}: ${dev.Status}")
                        return false
                    } else if (dev.Temperature > 120) {
                        dev.Status = false;
                        println("Устройство расплавилось, статус устройства ${dev.Name}: ${dev.Status}")
                        return false;
                    }
                }
            }
        }
        return true;
    }
    // Метод циклического обновления всех устройств
    // по индексу (включение или выключения) // Шаг 7 задание 2
    fun uploadedDevicesOfIndex(OnOrOff: Boolean){
        println();
        for (index in 0..deviceList.size - 1) {
            if (checkTempAndLight(deviceList[index].Name)) {
                deviceList[index].Status = OnOrOff;
                println("Устройство ${deviceList[index].Name} обновлено на ${OnOrOff}");

            }
        }
    }
    // Функция, которая принимает массив устройств
    // и выводит их состояние в консоль. Шаг 7 Задача 3
    fun checkingStatusDevices(vararg array: String){
        println();
        for (device in array){
            println("Статус устройства ${findDevice(device)?.Name}: ${findDevice(device)?.Status}")
        }
    }
    // Создаём функцию, которая будет принимать переменное количество параметров
    // настроек и применять их ко всем устройствам. Шаг 7 задача 5
    fun changeColorAllDevice(vararg color: String){
        var index: Int = 0;
        for (col in color){
            deviceList[index].Color = col;
            index++;
        }
    }
}