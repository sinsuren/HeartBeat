package protocols.server.heartbeat;

public interface Observer<T, D> {

    void update(T t, D d);
}
