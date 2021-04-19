public interface IEntityRepsitory<T extends IEntity >
{
    void add(T entity);
    void delete(T entity);
    void update(T entity);
}

/*
    <T extends IEntity > şeklinde yazarsak kısıt getirmiş oluruz. Bu önemli bir şeydir.
*/