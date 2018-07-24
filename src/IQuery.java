public interface IIQuery {
	public void query(Exporter _ex, long _start_time, long _end_time, Location _from_loc, Location _to_loc);
	public void query(Exporter _ex, long _start_time, long _end_time);
	public void query(Exporter _ex, Location _from_loc, Location _to_loc);
}
