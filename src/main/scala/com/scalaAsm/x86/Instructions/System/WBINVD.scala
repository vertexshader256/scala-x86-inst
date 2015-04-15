package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Write Back and Invalidate Cache
// Category: general

trait WBINVD extends InstructionDefinition {
  val mnemonic = "WBINVD"
}

object WBINVD extends ZeroOperands[WBINVD] with WBINVDImpl

trait WBINVDImpl extends WBINVD {
  implicit object WBINVD_0 extends _0 {
    val opcode: TwoOpcodes = (0x0F, 0x09)
  }
}
