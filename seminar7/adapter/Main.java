package seminar7.adapter;
    // Есть библиотека сбора данных от датчиков. Все они были куплены в комплекте с этой библиотекой.
    // Поступил новый датчик от другой компании, интерфейс которого отличается от предыдущих.
    // Надо включить этот датчик в систему.
public class Main {
    public static void main(String[] args) {
        MeteoStore meteoDb = new MeteoStore();

        MeteoSensor ms200_1 = new MS200(1);
        meteoDb.save(ms200_1);

        SensorTemperature st500 = new ST500Info().getData();
        MeteoSensor st500Adapted = new Adapter(st500);
        meteoDb.save(st500Adapted);
        // Здесь надо вызвать метод getData у класса ST500Info. Полученные данные отправить в метод save объекта meteoDb
    }
}
