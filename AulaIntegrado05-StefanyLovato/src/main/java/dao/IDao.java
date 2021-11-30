package dao;

public interface IDao <T>{

    public T save(T t);
    public T search(Integer id);
    public void delete(T t);
    public T update(T t);
}
