package com.haikal.photos.presentation.user;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u00060\nJ&\u0010\r\u001a\u00020\u00062\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e0\u000b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/haikal/photos/presentation/user/UserViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/haikal/photos/datasource/IRepository;", "(Lcom/haikal/photos/datasource/IRepository;)V", "deleteUser", "", "user", "Lcom/haikal/photos/datasource/local/model/User;", "state", "Lkotlin/Function1;", "Lcom/haikal/photos/presentation/user/UserState;", "", "getAllUser", "", "app_debug"})
public final class UserViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.haikal.photos.datasource.IRepository repository = null;
    
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    com.haikal.photos.datasource.IRepository repository) {
        super();
    }
    
    public final void getAllUser(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.haikal.photos.presentation.user.UserState<? extends java.util.List<com.haikal.photos.datasource.local.model.User>>, kotlin.Unit> state) {
    }
    
    public final void deleteUser(@org.jetbrains.annotations.NotNull()
    com.haikal.photos.datasource.local.model.User user, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.haikal.photos.presentation.user.UserState<java.lang.Boolean>, kotlin.Unit> state) {
    }
}