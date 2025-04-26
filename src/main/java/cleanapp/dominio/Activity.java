package cleanapp.dominio;

import java.time.LocalDateTime;


/**
 * A money transfer activity between {@link Account}s.
 */

public class Activity {

	private ActivityId id;

	/**
	 * The account that owns this activity.
	 */
	private final Account.AccountId ownerAccountId;

	/**
	 * The debited account.
	 */
	private final Account.AccountId sourceAccountId;
	public Account.AccountId getSourceAccountId () {
		return this.sourceAccountId;
	}

	/**
	 * The credited account.
	 */
	private final Account.AccountId targetAccountId;
	public Account.AccountId getTargetAccountId () {
		return this.targetAccountId;
	}

	/**
	 * The timestamp of the activity.
	 */
	private final LocalDateTime timestamp;
	public LocalDateTime getTimestamp () {
		return this.timestamp;
	}

	/**
	 * The money that was transferred between the accounts.
	 */
	private final Money money;
	public Money getMoney () {
		return this.money;
	}

	public Activity(
			Account.AccountId ownerAccountId,
			Account.AccountId sourceAccountId,
			Account.AccountId targetAccountId,
			LocalDateTime timestamp,
			Money money) {
		this.id = null;
		this.ownerAccountId = ownerAccountId;
		this.sourceAccountId = sourceAccountId;
		this.targetAccountId = targetAccountId;
		this.timestamp = timestamp;
		this.money = money;
	}

    public static class ActivityId {
		private final Long value = 0L;
	}
}
