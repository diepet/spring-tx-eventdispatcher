package it.diepet.spring.tx.eventdispatcher.event.failure;

import it.diepet.spring.tx.eventdispatcher.model.RollbackTransactionInfo;

/**
 * The Class RollbackTransactionErrorEvent.
 */
public class RollbackTransactionErrorEvent extends TransactionErrorEvent<RollbackTransactionInfo> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5794066984457838304L;

	/**
	 * Instantiates a new rollback transaction error event.
	 *
	 * @param rollbackTransactionInfo
	 *            the rollback transaction info
	 * @param error
	 *            the error
	 */
	public RollbackTransactionErrorEvent(RollbackTransactionInfo rollbackTransactionInfo, RuntimeException error) {
		super(rollbackTransactionInfo, error);
	}

}