package it.diepet.spring.tx.eventdispatcher.event.failure;

import it.diepet.spring.tx.eventdispatcher.model.CommitTransactionInfo;

/**
 * The Class CommitTransactionErrorEvent.
 */
public class CommitTransactionErrorEvent extends TransactionErrorEvent<CommitTransactionInfo> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2291424699348070283L;

	/**
	 * Instantiates a new commit transaction error event.
	 *
	 * @param commitTransactionInfo
	 *            the commit transaction info
	 * @param error
	 *            the error
	 */
	public CommitTransactionErrorEvent(CommitTransactionInfo commitTransactionInfo, RuntimeException error) {
		super(commitTransactionInfo, error);
	}

}
