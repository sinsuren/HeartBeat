package protocols.server.heartbeat;

public interface Observable<T, D> {

    void notify(T t, D d);
}
