package com.haikal.photos.datasource.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/haikal/photos/datasource/local/LocalRepositoryImpl;", "Lcom/haikal/photos/datasource/local/ILocalRepository;", "userDao", "Lcom/haikal/photos/datasource/local/room/UserDao;", "(Lcom/haikal/photos/datasource/local/room/UserDao;)V", "getUser", "Lcom/haikal/photos/datasource/local/model/User;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertUser", "", "user", "(Lcom/haikal/photos/datasource/local/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LocalRepositoryImpl implements com.haikal.photos.datasource.local.ILocalRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.haikal.photos.datasource.local.room.UserDao userDao = null;
    
    public LocalRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.haikal.photos.datasource.local.room.UserDao userDao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertUser(@org.jetbrains.annotations.NotNull()
    com.haikal.photos.datasource.local.model.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.haikal.photos.datasource.local.model.User> $completion) {
        return null;
    }
}