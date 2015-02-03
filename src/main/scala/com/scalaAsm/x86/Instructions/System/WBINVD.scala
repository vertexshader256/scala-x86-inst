package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Write Back and Invalidate Cache
// Category: general

object WBINVD extends InstructionDefinition("WBINVD") with WBINVDImpl

trait WBINVDImpl {
  implicit object WBINVD_0 extends WBINVD._0 {
    val opcode: TwoOpcodes = (0x0F, 0x09)
  }
}
