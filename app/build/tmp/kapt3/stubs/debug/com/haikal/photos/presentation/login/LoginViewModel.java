package com.haikal.photos.presentation.login;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/haikal/photos/presentation/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/haikal/photos/datasource/IRepository;", "(Lcom/haikal/photos/datasource/IRepository;)V", "getUser", "", "email", "", "password", "state", "Lkotlin/Function1;", "Lcom/haikal/photos/presentation/login/LoginState;", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.haikal.photos.datasource.IRepository repository = null;
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.haikal.photos.datasource.IRepository repository) {
        super();
    }
    
    public final void getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.haikal.photos.presentation.login.LoginState, kotlin.Unit> state) {
    }
}