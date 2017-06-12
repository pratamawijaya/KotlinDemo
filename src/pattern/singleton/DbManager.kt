package pattern.singleton

/**
 * Created by pratama on 6/12/17.
 */
object DbManager {
    val names = arrayListOf<String>()

    fun addName(name: String) {
        names.add(name)
    }

    fun getSavedNames(): ArrayList<String> = names
}

/**
 * compiled to java
 *
 *
 * public final class DbManager {
@NotNull
private static final ArrayList names;
public static final DbManager INSTANCE;

@NotNull
public final ArrayList getNames() {
return names;
}

public final void addName(@NotNull String name) {
Intrinsics.checkParameterIsNotNull(name, "name");
names.add(name);
}

@NotNull
public final ArrayList getSavedNames() {
return names;
}

private DbManager() {
INSTANCE = (DbManager)this;
names = new ArrayList();
}

static {
new DbManager();
}
}

 */
