package com.haikal.photos.presentation.user;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0016\u0010 \u001a\u00020\u00112\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\"H\u0002J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\'H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000e\u00a8\u0006("}, d2 = {"Lcom/haikal/photos/presentation/user/UserActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/haikal/photos/databinding/ActivityUserBinding;", "getBinding", "()Lcom/haikal/photos/databinding/ActivityUserBinding;", "binding$delegate", "Lkotlin/Lazy;", "userAdapter", "Lcom/haikal/photos/presentation/user/UserAdapter;", "vm", "Lcom/haikal/photos/presentation/user/UserViewModel;", "getVm", "()Lcom/haikal/photos/presentation/user/UserViewModel;", "vm$delegate", "deleteUser", "", "user", "Lcom/haikal/photos/datasource/local/model/User;", "logoutUser", "observeViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "showUserList", "genreList", "", "updateUser", "userClick", "verifyPassword", "password", "", "app_debug"})
public final class UserActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.haikal.photos.presentation.user.UserAdapter userAdapter;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy vm$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    
    public UserActivity() {
        super();
    }
    
    private final com.haikal.photos.presentation.user.UserViewModel getVm() {
        return null;
    }
    
    private final com.haikal.photos.databinding.ActivityUserBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void logoutUser() {
    }
    
    private final void observeViewModel() {
    }
    
    private final void showUserList(java.util.List<com.haikal.photos.datasource.local.model.User> genreList) {
    }
    
    private final void userClick(com.haikal.photos.datasource.local.model.User user) {
    }
    
    private final void updateUser(com.haikal.photos.datasource.local.model.User user) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void deleteUser(com.haikal.photos.datasource.local.model.User user) {
    }
    
    private final boolean verifyPassword(java.lang.String password) {
        return false;
    }
}