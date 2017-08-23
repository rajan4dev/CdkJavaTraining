interface AccountService<T extends Account> {
	void open(T account);
	void close(T account);
}