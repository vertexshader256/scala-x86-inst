package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Swap GS Base Register
// Category: general

trait SWAPGS extends InstructionDefinition {
  val mnemonic = "SWAPGS"
}

object SWAPGS extends ZeroOperands[SWAPGS] with SWAPGSImpl

trait SWAPGSImpl extends SWAPGS {
  implicit object SWAPGS_0 extends _0 {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 7
    override def hasImplicitOperand = true
  }
}
