package me.wacho.vacuum.menu.callback;

import java.io.Serializable;

public interface MenuCallback<T> extends Serializable {
    void callback(T data);
}
