/*


 *  
 *  @version     1.0, Mar 6, 2012
 *  @author Karan
 */
package com.nus.is5126.lcsia.dao;

import java.util.List;

import com.nus.is5126.lcsia.entity.LoanProcessed;
import com.nus.is5126.lcsia.form.MasterForm;

public interface ICoreDao {

    public List<String> getStateList();

    public List<LoanProcessed> getLoanResults(MasterForm masterForm);

}
