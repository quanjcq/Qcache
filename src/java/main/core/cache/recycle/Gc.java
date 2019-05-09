package core.cache.recycle;


/**
 * 回收缓存的内存
 * 不写了，以后再说吧
 * 2019/05/01
 */
public interface Gc {
    //1.可以在内存到达指定大小，拒绝添加数据操作，只支持读取删除数据
    //然后回收过期数据
    //2.也可以在系统空闲的时候提前清理过期缓存数据
}
