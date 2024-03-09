package Сервер.Репозиторий;

public interface Repository<T> {
    void save(T text);
    T load();
}